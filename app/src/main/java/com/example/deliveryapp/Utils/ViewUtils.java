package com.example.deliveryapp.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Hashtable;

public class ViewUtils {

    private Typeface mIcomoon, mDefaultFontBold, mDefaultFont, mSpecialLightFont,mSpecialRegFont,mButtonFontBold, mFontAwsomeFont;
    private Context mContext;

    private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();
    public static View sView;

    public ViewUtils(Context context) {

        mIcomoon = get(context, "icomoon");
        mFontAwsomeFont = get(context, "fontawesome-webfont");
        mSpecialLightFont = get(context, "Poppins-Light");
        mSpecialRegFont = get(context, "Poppins-Medium");
        mDefaultFont = get(context, "Poppins-Regular");
        mDefaultFontBold = get(context, "Poppins-Bold");
        mButtonFontBold = get(context, "Poppins-SemiBold");

        mContext = context;
    }

    public static Typeface get(Context c, String name) {
        synchronized (cache) {
            if (!cache.containsKey(name)) {
                Typeface t = Typeface.createFromAsset(
                        c.getAssets(),
                        String.format("%s.ttf", name)
                );
                cache.put(name, t);
            }
            return cache.get(name);
        }
    }

    public TextView createTextBoldView(View view) {

        TextView objTextView = (TextView) view;
        objTextView.setTypeface(mButtonFontBold);
        return objTextView;
    }

   public TextView createTextView(View view, boolean bold) {

        TextView objTextView = (TextView) view;
        if (bold)
            objTextView.setTypeface(mDefaultFontBold);
        else
            objTextView.setTypeface(mDefaultFont);
        return objTextView;
    }

    public TextView createTextListView(View view, boolean bold) {

        TextView objTextView = (TextView) view;
        if (bold)
            objTextView.setTypeface(mSpecialRegFont);
        else
            objTextView.setTypeface(mSpecialLightFont);
        return objTextView;
    }


    public RadioButton createRadioButton(View view, boolean bold) {

        RadioButton objRdoButton = (RadioButton) view;

        if (bold)
            objRdoButton.setTypeface(mDefaultFontBold);
        else
            objRdoButton.setTypeface(mDefaultFont);
        return objRdoButton;
    }

    public TextView createTextView(boolean bold) {

        TextView objTextView = new TextView(this.mContext);

        if (bold)
            objTextView.setTypeface(mDefaultFontBold);
        else
            objTextView.setTypeface(mDefaultFont);
        return objTextView;
    }


    public Button createButton(View view, boolean bold) {

        Button objButton = (Button) view;

        if (bold)
            objButton.setTypeface(mDefaultFontBold);
        else
            objButton.setTypeface(mButtonFontBold);
        return objButton;
    }

    public String stringText(View view, boolean bold) {

        String stringText = toString();

        return stringText;
    }


    public TextView createIconTextView(View view) {

        TextView objTextView = (TextView) view;
        objTextView.setTypeface(mFontAwsomeFont);

        return objTextView;
    }


    public TextView createIconTextView() {

        TextView objTextView = new TextView(this.mContext);
        objTextView.setTypeface(mFontAwsomeFont);

        return objTextView;
    }

    public EditText createEditText(View view, boolean bold) {

        EditText objEditText = (EditText) view;
        if (bold)
            objEditText.setTypeface(mSpecialLightFont);
        else
            objEditText.setTypeface(mSpecialLightFont);
        return objEditText;

    }
    public EditText createEditOldText(View view, boolean bold) {

        EditText objEditText = (EditText) view;
        if (bold)
            objEditText.setTypeface(mDefaultFont);
        else
            objEditText.setTypeface(mDefaultFontBold);
        return objEditText;

    }

    public EditText createEditText(boolean bold) {

        EditText objEditText = new EditText(mContext);
        if (bold)
            objEditText.setTypeface(mDefaultFontBold);
        else
            objEditText.setTypeface(mDefaultFont);
        return objEditText;

    }

    public TextView createIconViewTextView(View view) {

        TextView objTextView = (TextView) view;
        objTextView.setTypeface(mIcomoon);

        return objTextView;
    }

    public TextView createIconViewTextView() {

        TextView objTextView = new TextView(this.mContext);
        objTextView.setTypeface(mIcomoon);

        return objTextView;
    }

    public void setView(View view) {
        sView = view;

    }

    public View getView() {
        return sView;

    }

}
