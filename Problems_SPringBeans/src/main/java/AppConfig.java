
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.problem5_latest.Server;

@Configuration
// @ComponentScan("com.problem1")
// @ComponentScan("com.problem2")
// @ComponentScan("com.problem3")

//@ComponentScan("com.problem.usingapplicationproperty")
//@PropertySource("classpath:application.properties")

//@ComponentScan("com.problem4")
//@ComponentScan("com.problem5")

@ComponentScan("com.problem5_latest")


public class AppConfig{

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){

//			Book book = context.getBean(Book.class);
//			book.display();
			
//			MobileBuying mobile1 = context.getBean(MobileBuying.class);
//			mobile1.showCase();
			
//			DatabaseService databaseService= context.getBean(DatabaseService.class);
//			databaseService.settingProperties("URLLSSSS", "jeevaraju", "Jeevabhc@22");
//			databaseService.setConnection();
			
			// chatgpt solution tested
//			DatabaseService service = context.getBean(DatabaseService.class);
//          service.connect();
	
			// TESTING @Scope("singleton")
//			Counter counter = context.getBean(Counter.class);
//			counter.increment();
//			System.out.println(counter.getCount());        // 1
//			
//			Counter counter1 = context.getBean(Counter.class);
//			counter1.increment();
//			System.out.println(counter.getCount());        // 2   ---> it should have shown 1 by considering it as different object but it's not because we are added the @Scope("singleton") annotation
			
			// TESTING @Scope("prototype")
//			Counter counter2 = context.getBean(Counter.class);
//			counter2.increment();
//			System.out.println(counter2.getCount());        // 1
//			
//			Counter counter3 = context.getBean(Counter.class);
//			counter3.increment();
//			System.out.println(counter3.getCount());        // 1   ---> @Scope("prototype") --> it will always create a newbean 
		
			Server server = context.getBean(Server.class);
			server.run();
			context.close();
			
		}

	}

}
