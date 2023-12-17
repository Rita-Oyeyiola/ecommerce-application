import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBaseConfig {

    @Value("${spring.datasource.root}")
    private String databaseUsername;

    @Value("${spring.datasource.Omobolanle221}")
    private String databasePassword;

}
