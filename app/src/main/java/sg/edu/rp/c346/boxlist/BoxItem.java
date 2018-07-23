package sg.edu.rp.c346.boxlist;

/**
 * Created by 16038911 on 23/7/2018.
 */

public class BoxItem {
    private int ImageId;

    public BoxItem(int imageId) {
        ImageId = imageId;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "ImageId=" + ImageId +
                '}';
    }
}
