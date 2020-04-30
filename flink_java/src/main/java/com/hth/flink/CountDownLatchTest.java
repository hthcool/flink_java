package com.hth.flink;

import com.hth.flink.zookeeper.ZKWatcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @Author hantenghui
 * @Date 2020-04-29 18:52
 * @Email hantenghui@tuyoogame.com
 * @Description
 * CountDownLatch 使用
 */
public class CountDownLatchTest {

    // 声明了一个值为3的CountDownLatch
    private static CountDownLatch latch = new CountDownLatch(3);

    private static ZooKeeper zk;

    private static String zkUrl = "hthmac:2181";

    private static int sessionTimeOut = 10000;

    static {
        try {
            zk = new ZooKeeper(zkUrl, sessionTimeOut, new ZKWatcher());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String createNode() {

        return null;
    }


    public static void main(String[] args) {

    }
}
