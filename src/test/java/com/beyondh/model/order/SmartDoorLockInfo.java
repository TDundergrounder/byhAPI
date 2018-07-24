package com.beyondh.model.order;

public class SmartDoorLockInfo {
    public long CheckinId;

    public boolean IsCanOpen;

    public String Uri;

    public String QRCode;

    public long getCheckinId() {
        return CheckinId;
    }

    public void setCheckinId(long checkinId) {
        CheckinId = checkinId;
    }

    public boolean isCanOpen() {
        return IsCanOpen;
    }

    public void setCanOpen(boolean canOpen) {
        IsCanOpen = canOpen;
    }

    public String getUri() {
        return Uri;
    }

    public void setUri(String uri) {
        Uri = uri;
    }

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }
}
