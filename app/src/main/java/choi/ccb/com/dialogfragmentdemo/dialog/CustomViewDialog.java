package choi.ccb.com.dialogfragmentdemo.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import choi.ccb.com.dialogfragmentdemo.R;

/**
 * CCB:自定义view版Dialog
 */
public class CustomViewDialog extends DialogFragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_view1,container);
    }
}
