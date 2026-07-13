package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

import java.util.HashMap;
import java.util.Map;

public class WritingBehaviourRegistry {
    private Map<WritingBehaviour, WriteBeahviourStrategies> writingBehaviourMap=new HashMap<>();

    public void registerWritingBehaviour(WritingBehaviour writingBehaviour, WriteBeahviourStrategies writingBehaviourStrategy){
        writingBehaviourMap.put(writingBehaviour, writingBehaviourStrategy);
    }

    public WriteBeahviourStrategies getStrategies(WritingBehaviour writingBehaviour){
        return writingBehaviourMap.get(writingBehaviour);
    }

}
