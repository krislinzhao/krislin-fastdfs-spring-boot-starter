package club.krislin.spring.fastdfs;

import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerServer;

class FastDFSClient extends StorageClient1 {
    /**
     * 跟踪服务器
     */
    private TrackerServer trackerServer;
    /**
     * 存储服务器
     */
    private StorageServer storageServer;


    FastDFSClient(TrackerServer trackerServer,
                  StorageServer storageServer) {
        super(trackerServer, storageServer);
        this.trackerServer = trackerServer;
        this.storageServer = storageServer;
    }

    StorageClient1 getStorageClient1(){
        return new StorageClient1(trackerServer, storageServer);
    }

    TrackerServer getTrackerServer() {
        return trackerServer;
    }

    StorageServer getStorageServer() {
        return storageServer;
    }

}