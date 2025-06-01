public class zd74 {
    public class Beach implements Comparable<Beach>{
        private String name;      //название
        private float distance;   //расстояние
        private int quality;    //качество

        public Beach(String name, float distance, int quality) {
            this.name = name;
            this.distance = distance;
            this.quality = quality;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getDistance() {
            return distance;
        }

        public void setDistance(float distance) {
            this.distance = distance;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }
        @Override
        public int compareTo(Beach o) {
            if (this.distance != o.distance) {
                return Float.compare(this.distance, o.distance);
            }
            return Integer.compare(o.quality, this.quality);
        }
    }
    public static void main(String[] args) {

    }
}