package oop.dmdev.lesson16;

public enum ProcessorType implements Describable {  // не может наследоваться
    // может реализовівать абстрактные методы

    BIT_32("BIT_32"),
    //            {
//        @Override
//        public String getDescription() {
//            return "bit 32 desc";
//        }
//    },
    BIT_64("BIT_64");
    //{
//        @Override
//        public String getDescription() {
//            return "bit 64 desc";
//        }
//    };  // синглтоны, существуют в одном единственном числе

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }


    public String getName() {
        return name;
    }


}
