package StreamAssignment2;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainNews {

	public static void main(String[] args) {
		List<News>list = new ArrayList<>();
		list.add(new News(101,"Xyz","This is a vote on account","Yes true"));
		list.add(new News(103,"Def","Sports","budget"));
		list.add(new News(101,"Abp","Provides news worldwide","budget"));
		list.add(new News(102,"Abc","Get exclusive videos","Entertainment"));
		list.add(new News(101,"Xyz","Sports","budget is an account"));
		
		System.out.println("Assignment 5----------------------------------------------");
		
		List<News>list1=list.stream()
				.filter(n->n.getComment().contains("budget"))
				.collect(Collectors.toList());
		long l=list1.parallelStream().count();
		System.out.println("The word budget in comments: "+l);
		
		System.out.println("Assignment 4----------------------------------------------");
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));
	    long maxval=(Collections.max(map.values()));
	    for(java.util.Map.Entry<Object, Long> entry:map.entrySet()) {
	    	if(entry.getValue()==maxval) {
	    		System.out.println(entry.getKey());
	    	}
	    }
	    System.out.println("Assignment 6----------------------------------------------");
	    Map<Object, Long> map2 = list.stream().collect(Collectors.groupingBy(News::getPostedByUser, Collectors.counting()));
	    long maxval2=(Collections.max(map2.values()));
	    for(java.util.Map.Entry<Object, Long> entry:map2.entrySet()) {
	    	if(entry.getValue()==maxval2) {
	    		System.out.println(entry.getKey());
	    	}
	    }
	    System.out.println("Assignment 7----------------------------------------------");
	    Map<Object, Long> map3 = list.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
	    System.out.println(map3);
	    
}
}
