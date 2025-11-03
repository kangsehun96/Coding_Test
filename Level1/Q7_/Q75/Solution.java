package Level1.Q7_.Q75;

public class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[0] = i;
                break;
            }
        }

        int lux = wallpaper[0].length();
        for (int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#") && wallpaper[i].indexOf('#') < lux) lux = wallpaper[i].indexOf('#');
        }
        answer[1] = lux;

        for (int i = wallpaper.length - 1; i >= 0; i--) {
            if (wallpaper[i].contains("#")) {
                answer[2] = i + 1;
                break;
            }
        }

        int rdx = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#") && wallpaper[i].lastIndexOf('#') > rdx) rdx = wallpaper[i].lastIndexOf('#');
        }
        answer[3] = rdx + 1;

        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
    }
}
