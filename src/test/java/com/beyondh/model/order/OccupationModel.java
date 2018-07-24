package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;

    public class OccupationModel implements Serializable
    {
        private long OrderId;
        public  long getOrderId()
        {
            return OrderId;
        }
        public  void setOrderId(long value)
        {
            OrderId = value;
        }

        private long OccupationId;
        public final long getOccupationId()
        {
            return OccupationId;
        }
        public final void setOccupationId(long value)
        {
            OccupationId = value;
        }

        private String PhysicalRoomTypeId;
        public  String getPhysicalRoomTypeId()
        {
            return PhysicalRoomTypeId;
        }
        public  void setPhysicalRoomTypeId(String value)
        {
            PhysicalRoomTypeId = value;
        }

        private String PriceRoomTypeId;
        public  String getPriceRoomTypeId()
        {
            return PriceRoomTypeId;
        }
        public  void setPriceRoomTypeId(String value)
        {
            PriceRoomTypeId = value;
        }

        private String RoomNumber;
        public  String getRoomNumber()
        {
            return RoomNumber;
        }
        public  void setRoomNumber(String value)
        {
            RoomNumber = value;
        }

        private String OccupationStartTime ;
        public  String getOccupationStartTime()
        {
            return OccupationStartTime;
        }
        public  void setOccupationStartTime(String value)
        {
            OccupationStartTime = value;
        }

        private String OccupationEndTime;
        public  String getOccupationEndTime()
        {
            return OccupationEndTime;
        }
        public  void setOccupationEndTime(String value)
        {
            OccupationEndTime = value;
        }

        private boolean IsActive;
        public  boolean getIsActive()
        {
            return IsActive;
        }
        public  void setIsActive(boolean value)
        {
            IsActive = value;
        }

        private boolean Locked;
        public  boolean getLocked()
        {
            return Locked;
        }
        public  void setLocked(boolean value)
        {
            Locked = value;
        }

        private boolean IsMemberThemself;
        public  boolean getIsMemberThemself()
        {
            return IsMemberThemself;
        }
        public  void setIsMemberThemself(boolean value)
        {
            IsMemberThemself = value;
        }

        private boolean HasCheckin;
        public  boolean getHasCheckin()
        {
            return HasCheckin;
        }
        public  void setHasCheckin(boolean value)
        {
            HasCheckin = value;
        }

        @Override
        public String toString(){
            return new Gson().toJson(this);
        }
    }
