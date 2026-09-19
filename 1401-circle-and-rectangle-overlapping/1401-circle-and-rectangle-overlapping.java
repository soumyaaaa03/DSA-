class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = Math.max(x1, Math.min(xCenter, x2));
        int closeY = Math.max(y1, Math.min(yCenter, y2));
        double d = 0;
        d = Math.sqrt(((closeX - xCenter)* (closeX - xCenter)) + ((closeY - yCenter)* (closeY - yCenter)));
        d = Math.floor(d);
        int dis = (int) d;
        if (d <= radius) return true;
        return false;
    }
}