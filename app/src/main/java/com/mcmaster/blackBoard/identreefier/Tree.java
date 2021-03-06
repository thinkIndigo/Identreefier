package com.mcmaster.blackBoard.identreefier;

import android.support.annotation.NonNull;

public class Tree implements Comparable<Tree> {

    private String treeName;
    private double likelihood;

    public Tree(String name) {
        this.treeName = name;
        this.likelihood = 1.0;
    }

    public String getTreeName() {
        return this.treeName;
    }

    //synchronization should not be a concern here as only the blackboard accesses these classes,
    //and the blackboard should be synchronized
    public double getLikelihood() {
        return this.likelihood;
    }

    //synchronization should not be a concern here as only the blackboard accesses these classes,
    //and the blackboard should be synchronized
    public void multiplyLikelihood(double lh) {
        this.likelihood = this.likelihood * lh;
    }

    public void resetLikelihood() {
        this.likelihood = 1.0;
    }

    @Override
    public int compareTo(@NonNull Tree o) {
        if (this.getLikelihood() > o.getLikelihood())
            return -1;
        else if (this.getLikelihood() < o.getLikelihood())
            return 1;
        else return 0;
    }
}
