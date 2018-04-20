package com.hdkj.lyt.hnlyt_fire.util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wang Guodong
 */
public class FormatTransferUtil {

    /**
     * ��intתΪ���ֽ���ǰ�����ֽ��ں��byte����
     *
     * @param n int
     * @return byte[]
     */
    public static byte[] toLH(int n) {
        byte[] b = new byte[4];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        b[2] = (byte) (n >> 16 & 0xff);
        b[3] = (byte) (n >> 24 & 0xff);
        return b;
    }

    /**
     * ��intתΪ���ֽ���ǰ�����ֽ��ں��byte����
     *
     * @param n int
     * @return byte[]
     */
    public static byte[] toHH(int n) {
        byte[] b = new byte[4];
        b[3] = (byte) (n & 0xff);
        b[2] = (byte) (n >> 8 & 0xff);
        b[1] = (byte) (n >> 16 & 0xff);
        b[0] = (byte) (n >> 24 & 0xff);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(hBytesToInt(toHH(33050)));
    }

    /**
     * ��shortתΪ���ֽ���ǰ�����ֽ��ں��byte����
     *
     * @param n short
     * @return byte[]
     */
    public static byte[] toLH(short n) {
        byte[] b = new byte[2];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        return b;
    }

    /**
     * ��shortתΪ���ֽ���ǰ�����ֽ��ں��byte����
     *
     * @param n short
     * @return byte[]
     */
    public static byte[] toHH(short n) {
        byte[] b = new byte[2];
        b[1] = (byte) (n & 0xff);
        b[0] = (byte) (n >> 8 & 0xff);
        return b;
    }

    /**
     * ��floatתΪ���ֽ���ǰ�����ֽ��ں��byte����
     */
    public static byte[] toLH(float f) {
        return toLH(Float.floatToRawIntBits(f));
    }

    /**
     * ��floatתΪ���ֽ���ǰ�����ֽ��ں��byte����
     */
    public static byte[] toHH(float f) {
        return toHH(Float.floatToRawIntBits(f));
    }

    /**
     * ��StringתΪbyte����
     */
    public static byte[] stringToBytes(String s, int length) {
        while (s.getBytes().length < length) {
            s += " ";
        }
        return s.getBytes();
    }

    /**
     * ���ֽ�����ת��ΪString
     *
     * @param b byte[]
     * @return String
     */
    public static String bytesToString(byte[] b) {
        StringBuffer result = new StringBuffer("");
        int length = b.length;
        for (int i = 0; i < length; i++) {
            result.append((char) (b[i] & 0xff));
        }
        return result.toString();
    }

    /**
     * ���ַ���ת��Ϊbyte����
     *
     * @param s String
     * @return byte[]
     */
    public static byte[] stringToBytes(String s) {
        return s.getBytes();
    }

    /**
     * �����ֽ�����ת��Ϊint
     *
     * @param b byte[]
     * @return int
     */
    public static int hBytesToInt(byte[] b) {
        try {
            String str = new String(b,"utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FormatTransferUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        int s = 0;
        for (int i = 0; i < 3; i++) {
            if (b[i] >= 0) {
                s = s + b[i];
            } else {
                s = s + 256 + b[i];
            }
            s = s * 256;
        }
        if (b[3] >= 0) {
            s = s + b[3];
        } else {
            s = s + 256 + b[3];
        }
        return s;
    }

    /**
     * �����ֽ�����ת��Ϊint
     *
     * @param b byte[]
     * @return int
     */
    public static int lBytesToInt(byte[] b) {
        int s = 0;
        for (int i = 0; i < 3; i++) {
            if (b[3 - i] >= 0) {
                s = s + b[3 - i];
            } else {
                s = s + 256 + b[3 - i];
            }
            s = s * 256;
        }
        if (b[0] >= 0) {
            s = s + b[0];
        } else {
            s = s + 256 + b[0];
        }
        return s;
    }

    /**
     * ���ֽ����鵽short��ת��
     *
     * @param b byte[]
     * @return short
     */
    public static short hBytesToShort(byte[] b) {
        int s = 0;
        if (b[0] >= 0) {
            s = s + b[0];
        } else {
            s = s + 256 + b[0];
        }
        s = s * 256;
        if (b[1] >= 0) {
            s = s + b[1];
        } else {
            s = s + 256 + b[1];
        }
        short result = (short) s;
        return result;
    }

    /**
     * ���ֽ����鵽short��ת��
     *
     * @param b byte[]
     * @return short
     */
    public static short lBytesToShort(byte[] b) {
        int s = 0;
        if (b[1] >= 0) {
            s = s + b[1];
        } else {
            s = s + 256 + b[1];
        }
        s = s * 256;
        if (b[0] >= 0) {
            s = s + b[0];
        } else {
            s = s + 256 + b[0];
        }
        short result = (short) s;
        return result;
    }

    /**
     * ���ֽ�����ת��Ϊfloat
     *
     * @param b byte[]
     * @return float
     */
    public static float hBytesToFloat(byte[] b) {
        int i = 0;
        Float F = new Float(0.0);
        i = ((((b[0] & 0xff) << 8 | (b[1] & 0xff)) << 8) | (b[2] & 0xff)) << 8 | (b[3] & 0xff);
        return Float.intBitsToFloat(i);
    }

    /**
     * ���ֽ�����ת��Ϊfloat
     *
     * @param b byte[]
     * @return float
     */
    public static float lBytesToFloat(byte[] b) {
        int i = 0;
        Float F = new Float(0.0);
        i = ((((b[3] & 0xff) << 8 | (b[2] & 0xff)) << 8) | (b[1] & 0xff)) << 8 | (b[0] & 0xff);
        return Float.intBitsToFloat(i);
    }

    /**
     * ��byte�����е�Ԫ�ص�������
     */
    public static byte[] bytesReverseOrder(byte[] b) {
        int length = b.length;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[length - i - 1] = b[i];
        }
        return result;
    }

    /**
     * ��ӡbyte����
     */
    public static void printBytes(byte[] bb) {
        int length = bb.length;
        for (int i = 0; i < length; i++) {
            System.out.print(bb + " ");
        }
        System.out.println("");
    }

    public static void logBytes(byte[] bb) {
        int length = bb.length;
        String ut = "";
        for (int i = 0; i < length; i++) {
            ut = ut + bb[i] + " ";
        }

    }

    /**
     * ��int���͵�ֵת��Ϊ�ֽ���ߵ�������Ӧ��intֵ
     *
     * @param i int
     * @return int
     */
    public static int reverseInt(int i) {
        int result = FormatTransferUtil.hBytesToInt(FormatTransferUtil.toLH(i));
        return result;
    }

    /**
     * ��short���͵�ֵת��Ϊ�ֽ���ߵ�������Ӧ��shortֵ
     *
     * @param s short
     * @return short
     */
    public static short reverseShort(short s) {
        short result = FormatTransferUtil.hBytesToShort(FormatTransferUtil.toLH(s));
        return result;
    }

    /**
     * ��float���͵�ֵת��Ϊ�ֽ���ߵ�������Ӧ��floatֵ
     *
     * @param f float
     * @return float
     */
    public static float reverseFloat(float f) {
        float result = FormatTransferUtil.hBytesToFloat(FormatTransferUtil.toLH(f));
        return result;
    }
}
