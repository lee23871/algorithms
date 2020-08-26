package com.thlee.algorithms.leek;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {

    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String[] pathArr = path.split("/");

        for (String pathStr : pathArr) {
            if (pathStr == null || pathStr.equals("") || pathStr.equals(".")) {
                continue;
            }

            if (pathStr.equals("..")) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(pathStr);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append("/");
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
