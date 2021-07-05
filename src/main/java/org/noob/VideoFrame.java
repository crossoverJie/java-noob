package org.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author crossoverJie
 * Date: 2021/7/3 20:22
 * @since JDK 11
 */
public class VideoFrame {

    public static void main(String[] args) {
        String ffmpegExePath = "ffmpeg";
        String inputFilePath = "/Users/chenjie/Documents/dev/github/java-noob/resource/out.mp4";
        String outputFilePath = "/Users/chenjie/Documents/dev/github/java-noob/resource/out.jpg";
        List<String> command = new ArrayList<String>();
        command.add(ffmpegExePath);
        command.add("-i");
        command.add(inputFilePath);
        command.add("-f");
        command.add("image2");
        command.add("-ss");
        command.add("1");
        command.add("-t");
        command.add("0.001");
        command.add("-s");
        command.add("320*240");
        command.add(outputFilePath);
        ProcessBuilder builder = new ProcessBuilder();
        builder.command(command);
        //正常信息和错误信息合并输出
        builder.redirectErrorStream(true);
        try {
            //开始执行命令
            Process process = builder.start();
            //如果你想获取到执行完后的信息，那么下面的代码也是需要的
            StringBuilder sbf = new StringBuilder();
            String line = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = br.readLine()) != null) {
                sbf.append(line);
                sbf.append("\n");
            }
            String resultInfo = sbf.toString();
            System.out.println(resultInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
