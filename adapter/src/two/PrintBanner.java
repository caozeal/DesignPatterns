package two;

import one.Banner;

/**
 * <p>创建时间：2017/12/3 17:49
 * <p>two
 * @author caozeal
 * @version 1.0
 */
public class PrintBanner extends Print {
    private Banner banner;

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
