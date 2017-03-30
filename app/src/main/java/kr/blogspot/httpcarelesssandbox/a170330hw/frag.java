package kr.blogspot.httpcarelesssandbox.a170330hw;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by 윤현하 on 2017-03-30.
 */

public class frag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.frag, container, false);
        return fragview;
    }
}