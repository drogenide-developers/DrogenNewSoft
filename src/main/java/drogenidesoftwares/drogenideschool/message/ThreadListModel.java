package drogenidesoftwares.drogenideschool.message;

/**
 * Created by pc1 on 3/28/2018.
 */

public class ThreadListModel
{
    public String threadName;
    public String threadLastSenderName;
    public String threadLastSenderMsg;
    public String lastSendMsgtime;
    public String profUrl;

    public String getProfUrl() {
        return profUrl;
    }

    public void setProfUrl(String profUrl) {
        this.profUrl = profUrl;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadLastSenderName() {
        return threadLastSenderName;
    }

    public void setThreadLastSenderName(String threadLastSenderName) {
        this.threadLastSenderName = threadLastSenderName;
    }

    public String getThreadLastSenderMsg() {
        return threadLastSenderMsg;
    }

    public void setThreadLastSenderMsg(String threadLastSenderMsg) {
        this.threadLastSenderMsg = threadLastSenderMsg;
    }

    public String getLastSendMsgtime() {
        return lastSendMsgtime;
    }

    public void setLastSendMsgtime(String lastSendMsgtime) {
        this.lastSendMsgtime = lastSendMsgtime;
    }
}
