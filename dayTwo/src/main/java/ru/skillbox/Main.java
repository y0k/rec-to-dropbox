package ru.skillbox;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

public class Main {
    public static void main(String[] args) {

        String ACCESS_TOKEN = "sl.akM1lyL-bVSy_Wnda9zndyx0dcJPWrMrJikJ0Tz7Avcw9q60pBzES_Nh9St8Irj8i6sI8F_lPpAarSNvmoQAQZPZzZjGfU5nR3WY1hjS7pwnQSYeozA4oC7wbpy8JgPNo0iO71o";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        JavaSoundRecorder recorder = new JavaSoundRecorder(client);
        recorder.recordAudio(30000);
    }
    }
