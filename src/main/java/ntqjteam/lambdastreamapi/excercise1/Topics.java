package ntqjteam.lambdastreamapi.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Topics {
	public static List<Topic> initCurrentTopic(){
		List<Topic> currentTopics = new ArrayList<>();
		Topic topic1 = new Topic("1", "topic1", "topic1_des");
        Topic topic2 = new Topic("2", "topic2", "topic2_des");
        Topic topic3 = new Topic("3", "topic3", "topic3_des");
        Topic topic4 = new Topic("4", "topic4", "topic4_des");
        Topic topic5 = new Topic("5", "topic5", "topic5_des");
        currentTopics.add(topic1);
        currentTopics.add(topic2);
        currentTopics.add(topic3);
        currentTopics.add(topic4);
        currentTopics.add(topic5);
        return currentTopics;
	}
	
	public static List<Topic> initUpdateTopic(){
		List<Topic> currentTopics = new ArrayList<>();
		Topic topic1 = new Topic("1", "topic1", "topic1_des");
		Topic topic3 = new Topic("3", "topic3_updated", "topic3_des");
		Topic topic4 = new Topic("4", "topic4", "topic4_des");
		Topic topic5 = new Topic("5", "topic5", "topic5_des");
		Topic topic6 = new Topic("6", "topic6", "topic6_des");
		currentTopics.add(topic1);
		currentTopics.add(topic3);
		currentTopics.add(topic4);
		currentTopics.add(topic5);
		currentTopics.add(topic6);
		return currentTopics;
	}
}
