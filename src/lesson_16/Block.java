package lesson_16;

public class Block {
    int length, width, depth, volume;

    Block(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        volume = length * width * depth;
    }

    boolean sameBlock(Block ob) {
        if ((ob.length == length) & (ob.width == width) & (ob.depth == depth)){
            return true;
        }else {
            return false;
        }
    }
    boolean sameVolume(Block ob){
        if (ob.volume == volume){
            return true;
        }else {
            return false;
        }
    }
}
