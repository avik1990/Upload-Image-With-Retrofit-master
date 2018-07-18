package com.hakiki95.uploadimage.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hakiki95 on 4/26/2017.
 */

public class ResponseApiModel {

    @SerializedName("status")
    @Expose
    String status;

    @SerializedName("Message")
    @Expose
    String Message;

    @SerializedName("data")
    @Expose
    Dataum data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Dataum getData() {
        return data;
    }

    public void setData(Dataum data) {
        this.data = data;
    }

    public class Dataum {

        @SerializedName("UploadedFileName")
        @Expose
        List<UploadedFileName> UploadedFileName;

        public List<ResponseApiModel.UploadedFileName> getUploadedFileName() {
            return UploadedFileName;
        }

        public void setUploadedFileName(List<ResponseApiModel.UploadedFileName> uploadedFileName) {
            UploadedFileName = uploadedFileName;
        }
    }

    public class UploadedFileName {
        @SerializedName("AttachemnetFile")
        @Expose
        String AttachemnetFile;

        public String getAttachemnetFile() {
            return AttachemnetFile;
        }

        public void setAttachemnetFile(String attachemnetFile) {
            AttachemnetFile = attachemnetFile;
        }
    }


}
