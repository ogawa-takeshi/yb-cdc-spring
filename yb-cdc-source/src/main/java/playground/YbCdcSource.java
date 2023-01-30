package playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.fn.supplier.cdc.CdcSupplierConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CdcSupplierConfiguration.class )
public class YbCdcSource {

    public static void main(String[] args) {
        SpringApplication.run(YbCdcSource.class, args);
    }

}
