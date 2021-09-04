package com.example.serviceswe;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FileOperationService extends Service {

    private String name = "";

    private void saveToFile(){
        try{
            File directory = new File(getFilesDir() + File.separator +"NameFolder");
            if(!directory.exists()){
                directory.mkdir();
            }

            File file = new File(directory,"name.txt");
            if(!file.exists()){
                file.createNewFile();
            }

            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
            writer.append(name);
            writer.close();
        }catch (Exception e){
            return;
        }

    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            saveToFile();
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public FileOperationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(intent!=null){
            name = intent.getStringExtra("name");
        }
        launchBackgroundThread();
        return super.onStartCommand(intent, flags, startId);
    }

    private void launchBackgroundThread() {
        Thread thread = new Thread(runnable);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}