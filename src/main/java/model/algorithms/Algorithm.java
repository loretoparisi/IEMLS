package model.algorithms;

import model.object.agent.Agent;
import util.Directions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Rudolf Cicko on 7/11/16.
 * @email: alu0100824780@ull.edu.es
 * @description: Main class of algorithms
 */
public abstract class Algorithm implements Cloneable {

    /**
     * All available algorithms
     */
    private static ArrayList<Algorithm> algorithms = new ArrayList<>();

    static {
        algorithms.add(new Explorer());
    }

    private Agent agent = null;

    public static ArrayList<Algorithm> getAlgorithms() {
        return algorithms;
    }

    /**
     * Initialize algorithm, it could run in background
     */
    public abstract void start();

    /**
     * Get an update from algorithm, the environment uses ticks to update its "world" each unit of time its called this
     * function by all agents.
     */
    public abstract void update();

    /**
     * Stop algorithm, especially when its used threads with ourselves resources.
     */
    public abstract void stop();

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
