package felix.jacobsen.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JpaConfig {

    @Bean(name = "mysqlDataSource")
    public DataSource mDataSource(){
        DataSourceBuilder<?> theDataSourceBuilder = DataSourceBuilder.create();
        theDataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        theDataSourceBuilder.url("jdbc:mysql://mysql:3306/products");
        theDataSourceBuilder.password("password");
        theDataSourceBuilder.username("user");
        return theDataSourceBuilder.build();
    }





}
