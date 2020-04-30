package com.hth.flink.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * @Author hantenghui
 * @Date 2020-04-29 16:00
 * @Email hantenghui@tuyoogame.com
 */
public class ZKWatcher implements Watcher {

    /**
     * 监控 zk 节点变化 Event
     * @param event
     */
    @Override
    public void process(WatchedEvent event) {

        Event.EventType eventType = event.getType();

        if (Event.KeeperState.SyncConnected == event.getState()) {
            
        }
    }
}
