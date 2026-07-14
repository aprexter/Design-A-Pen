package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

import java.util.HashMap;
import java.util.Map;

public class WritingBehaviourRegistry {
    private Map<WritingBehaviour, WriteBeahviourStrategies> writingBehaviourMap=new HashMap<>();
    private static WritingBehaviourRegistry instance;
    private WritingBehaviourRegistry() {
        Pen.writingBehaviourRegistry=this;
    }

    public void registerWritingBehaviour(WritingBehaviour writingBehaviour, WriteBeahviourStrategies writingBehaviourStrategy){
        writingBehaviourMap.put(writingBehaviour, writingBehaviourStrategy);
    }

    public WriteBeahviourStrategies getStrategies(WritingBehaviour writingBehaviour){
        return writingBehaviourMap.get(writingBehaviour);
    }

    public static WritingBehaviourRegistry getInstance() {
        if (instance == null) {
            synchronized (WritingBehaviourRegistry.class) {
                if (instance == null) {
                    instance = new WritingBehaviourRegistry();
                }
            }
        }
        return instance;
    }

}
