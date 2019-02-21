package choi.ccb.com.dialogfragmentdemo.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class DialogTypeDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("提示")
                .setMessage("重写onCreateDialog其他就和Dialog设置方式相同，可以设置view或者dialog中设置setContentView和其他事件")
                .setPositiveButton("确定", null)
                .setNegativeButton("取消", null);
        return builder.create();
    }
}
