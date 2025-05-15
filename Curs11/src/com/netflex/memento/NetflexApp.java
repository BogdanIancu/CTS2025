package com.netflex.memento;

public class NetflexApp {
    private NetlfexPageHistoryManager historyManager = new NetlfexPageHistoryManager();
    private NetflexAppPage currentPage;

    public NetflexApp(NetflexAppPage currentPage) {
        this.currentPage = currentPage;
    }

    public NetflexAppPage getCurrentPage() {
        return currentPage;
    }

    public void navigateTo(NetflexAppPage page) {
        //...
        historyManager.addToHistory(currentPage);
        currentPage = page;
    }

    public void navigateBack() {
        currentPage = historyManager.getLastPageFromHistory();
    }
}
