package karacken.curl;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by karacken on 18/11/16.
 */
public class PageCurlAdapter  {

    List<String> res_list = new ArrayList<>();
    static HashMap<String, Bitmap> res_map = null;

    public PageCurlAdapter(String[] res_list)
    {
        for(String res_item : res_list)
        {
            this.res_list.add(res_item);
        }
    }

    public PageCurlAdapter(String[] res_list, HashMap<String, Bitmap> map)
    {
        this(res_list);
        this.res_map = map;
    }

    public int getCount()
    {
        return res_list.size();
    }

    public String getItemResource(int position)
    {
        return res_list.get(position);
    }

    public static HashMap<String, Bitmap> getResourceMap() {
        return res_map;
    }

}
