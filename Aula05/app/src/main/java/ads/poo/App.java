package ads.poo;

import java.io.IOException;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.QRCode;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import barcode.CodigoDeBarra;

public class App {
    public static void main(String[] args) throws IOException, WriterException {

//        Scanner linha = new Scanner(System.in);
//        int i = 1;
//        while (linha.hasNext()) {
//            String aux = linha.nextLine();
//            System.out.println(i++ + " - " + aux.toUpperCase());
//        }

//    CodigoDeBarra.gerarCodigoDeBarra("123456", "saida.png");

    QRCodeWriter qrCodeWriter = new QRCodeWriter();

    String msg = "https://www.instagram.com/naeg_xisto/";
    BitMatrix bitMatrix = qrCodeWriter.encode(msg, BarcodeFormat.QR_CODE,600 , 600);

    Path arquivo = FileSystems.getDefault().getPath("qrcode.png");

    MatrixToImageWriter.writeToPath(bitMatrix , "PNG", arquivo);

    }
}
