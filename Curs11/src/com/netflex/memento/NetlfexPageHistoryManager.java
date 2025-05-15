package com.netflex.memento;

import java.util.Stack;

public class NetlfexPageHistoryManager {
    private Stack<NetflexAppPage> navigationHistory = new Stack<>();

    public void addToHistory(NetflexAppPage page) {
        navigationHistory.push(page);
    }

    public NetflexAppPage getLastPageFromHistory() {
        return navigationHistory.pop();
    }
}
