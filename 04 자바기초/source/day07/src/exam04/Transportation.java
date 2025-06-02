package exam04;

public enum Transportation {//열거형의 생성자는 private
    BUS(1400){
        public int getTotal(int person){
            return getBaseFare() * person;
        }
    },
    SUBWAY(1400){
        public int getTotal(int person){
            return getBaseFare()*person;
        }
    },
    TAXI(4800){
        public int getTotal(int person){
            return getBaseFare()*person;
        }
    },
    AIRPLANE(138300){
        public int getTotal(int person){
            return getBaseFare()*person;
        }
    },
    BOAT(44000){
        public int getTotal(int person){
            return getBaseFare()*person;
        }
    };

    private int baseFare;
    Transportation(int baseFare){
        this.baseFare = baseFare;
    }

    public int getBaseFare() {
        return baseFare;
    }
    abstract int getTotal(int person);
}