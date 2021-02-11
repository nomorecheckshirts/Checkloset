package io.github.checkloset;

import android.content.Context;

public class DrawerHandleButton extends androidx.appcompat.widget.AppCompatButton {
    private static final int[] STATE_FOLDED = {R.attr.state_folded};
    private boolean mIsFolded = true;

    public DrawerHandleButton(Context context) {
        super(context);
    }

    public void setFolded(boolean IsFolded){ mIsFolded = IsFolded; }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        if (mIsFolded) {
            mergeDrawableStates(drawableState, STATE_FOLDED);
        }
        return drawableState;
    }
}
