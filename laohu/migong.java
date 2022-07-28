public class migong {
    public static void main (String[] args){
        int[][] map = new int[10][9];
        for(int i = 0; i < 9; i++) {
            map[0][i] = 1;
            map[9][i] = 1;

        }
        for(int i =0; i < 10; i++) {
            map[i][0] = 1;
            map[i][8] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[4][2] = 6;
        map[5][2] = 9;
        map[5][3] = 1;
        System.out.println("========当前地图情况===========");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
            T t1 = new T();
            t1.findWay(map, 1, 1);

            System.out.println("========找路地图情况===========");

            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
        }
    }
}
    // 下右上左   0可走1障碍物2可以走3走过，死路
    class T {
        public boolean findWay(int[][] map , int i, int j) {

            if(map[8][7] == 2) {
                return true;
            }else {
                if(map[i][j] == 0) {
                    map[i][j] = 2;
                    if(findWay(map, i + 1, j)) {//xia
                        return true;
                    } else if(findWay(map, i, j + 1)) {//you
                        return true;
                    } else if(findWay(map, i - 1, j)) {//shang
                        return true;
                    } else if(findWay(map, i, j - 1)) {//zuo
                        return true;
                    } else {
                        map[i][j] = 3;
                        return false;
                    }
                  

                } else {
                    return false;

                }
            }

        }
 }
    



    

