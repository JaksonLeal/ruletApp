package co.edu.unab.leal.jakson.ruletapp.controlador;
import co.edu.unab.leal.jakson.ruletapp.MainActivity;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import co.edu.unab.leal.jakson.ruletapp.modelo.Base;

public class ControladorNumeroEnJuego {
    public static ArrayList<Integer> listaFinal = new ArrayList<>();
    private static String respuesta = "|";

    /* renamed from: DB */
    private Base f34DB = new Base();

    public void llenarPrimerNumero(int numEnJuego) {
        switch (numEnJuego) {
            case 0:
                this.f34DB.matrizBase0();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 1:
                this.f34DB.matrizBase1();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 2:
                this.f34DB.matrizBase2();
                for (int i3 = 0; i3 < this.f34DB.auxListDB.size(); i3++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i3));
                }
                return;
            case 3:
                this.f34DB.matrizBase3();
                for (int i4 = 0; i4 < this.f34DB.auxListDB.size(); i4++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i4));
                }
                return;
            case 4:
                this.f34DB.matrizBase4();
                for (int i5 = 0; i5 < this.f34DB.auxListDB.size(); i5++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i5));
                }
                return;
            case 5:
                this.f34DB.matrizBase5();
                for (int i6 = 0; i6 < this.f34DB.auxListDB.size(); i6++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i6));
                }
                return;
            case 6:
                this.f34DB.matrizBase6();
                for (int i7 = 0; i7 < this.f34DB.auxListDB.size(); i7++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i7));
                }
                return;
            case 7:
                this.f34DB.matrizBase7();
                for (int i8 = 0; i8 < this.f34DB.auxListDB.size(); i8++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i8));
                }
                return;
            case 8:
                this.f34DB.matrizBase8();
                for (int i9 = 0; i9 < this.f34DB.auxListDB.size(); i9++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i9));
                }
                return;
            case 9:
                this.f34DB.matrizBase9();
                for (int i10 = 0; i10 < this.f34DB.auxListDB.size(); i10++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i10));
                }
                return;
            case 10:
                this.f34DB.matrizBase10();
                for (int i11 = 0; i11 < this.f34DB.auxListDB.size(); i11++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i11));
                }
                return;
            case 11:
                this.f34DB.matrizBase11();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 12:
                this.f34DB.matrizBase12();
                for (int i13 = 0; i13 < this.f34DB.auxListDB.size(); i13++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i13));
                }
                return;
            case 13:
                this.f34DB.matrizBase13();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 14:
                this.f34DB.matrizBase14();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 15:
                this.f34DB.matrizBase15();
                for (int i16 = 0; i16 < this.f34DB.auxListDB.size(); i16++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i16));
                }
                return;
            case 16:
                this.f34DB.matrizBase16();
                for (int i17 = 0; i17 < this.f34DB.auxListDB.size(); i17++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i17));
                }
                return;
            case 17:
                this.f34DB.matrizBase17();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 18:
                this.f34DB.matrizBase18();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 19:
                this.f34DB.matrizBase19();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 20:
                this.f34DB.matrizBase20();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 21:
                this.f34DB.matrizBase21();
                for (int i22 = 0; i22 < this.f34DB.auxListDB.size(); i22++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i22));
                }
                return;
            case 22:
                this.f34DB.matrizBase22();
                for (int i23 = 0; i23 < this.f34DB.auxListDB.size(); i23++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i23));
                }
                return;
            case 23:
                this.f34DB.matrizBase23();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 24:
                this.f34DB.matrizBase24();
                for (int i25 = 0; i25 < this.f34DB.auxListDB.size(); i25++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i25));
                }
                return;
            case 25:
                this.f34DB.matrizBase25();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 26:
                this.f34DB.matrizBase26();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 27:
                this.f34DB.matrizBase27();
                for (int i28 = 0; i28 < this.f34DB.auxListDB.size(); i28++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i28));
                }
                return;
            case 28:
                this.f34DB.matrizBase28();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 29:
                this.f34DB.matrizBase29();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 30:
                this.f34DB.matrizBase30();
                for (int i31 = 0; i31 < this.f34DB.auxListDB.size(); i31++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i31));
                }
                return;
            case 31:
                this.f34DB.matrizBase31();
                for (int i32 = 0; i32 < this.f34DB.auxListDB.size(); i32++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i32));
                }
                return;
            case 32:
                this.f34DB.matrizBase32();
                for (int i33 = 0; i33 < this.f34DB.auxListDB.size(); i33++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i33));
                }
                return;
            case 33:
                this.f34DB.matrizBase33();
                for (int i34 = 0; i34 < this.f34DB.auxListDB.size(); i34++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i34));
                }
                return;
            case 34:
                this.f34DB.matrizBase34();
                for (int i35 = 0; i35 < this.f34DB.auxListDB.size(); i35++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i35));
                }
                return;
            case 35:
                this.f34DB.matrizBase35();
                for (int i36 = 0; i36 < this.f34DB.auxListDB.size(); i36++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i36));
                }
                return;
            case 36:
                this.f34DB.matrizBase36();
                for (int i37 = 0; i37 < this.f34DB.auxListDB.size(); i37++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i37));
                }
                return;
            case 37:
                this.f34DB.matrizBase00();
                for (int i38 = 0; i38 < this.f34DB.auxListDB.size(); i38++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i38));
                }
                return;
            default:
        }
    }

    public void llenarSegundoNumero(int numEnJuego) {
        switch (numEnJuego) {
            case 0:
                this.f34DB.matrizBase0();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 1:
                this.f34DB.matrizBase1();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 2:
                this.f34DB.matrizBase2();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 3:
                this.f34DB.matrizBase3();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 4:
                this.f34DB.matrizBase4();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 5:
                this.f34DB.matrizBase5();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 6:
                this.f34DB.matrizBase6();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 7:
                this.f34DB.matrizBase7();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 8:
                this.f34DB.matrizBase8();
                for (int i9 = 0; i9 < this.f34DB.auxListDB.size(); i9++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i9));
                }
                return;
            case 9:
                this.f34DB.matrizBase9();
                for (int i10 = 0; i10 < this.f34DB.auxListDB.size(); i10++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i10));
                }
                return;
            case 10:
                this.f34DB.matrizBase10();
                for (int i11 = 0; i11 < this.f34DB.auxListDB.size(); i11++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i11));
                }
                return;
            case 11:
                this.f34DB.matrizBase11();
                for (int i12 = 0; i12 < this.f34DB.auxListDB.size(); i12++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i12));
                }
                return;
            case 12:
                this.f34DB.matrizBase12();
                for (int i13 = 0; i13 < this.f34DB.auxListDB.size(); i13++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i13));
                }
                return;
            case 13:
                this.f34DB.matrizBase13();
                for (int i14 = 0; i14 < this.f34DB.auxListDB.size(); i14++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i14));
                }
                return;
            case 14:
                this.f34DB.matrizBase14();
                for (int i15 = 0; i15 < this.f34DB.auxListDB.size(); i15++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i15));
                }
                return;
            case 15:
                this.f34DB.matrizBase15();
                for (int i16 = 0; i16 < this.f34DB.auxListDB.size(); i16++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i16));
                }
                return;
            case 16:
                this.f34DB.matrizBase16();
                for (int i17 = 0; i17 < this.f34DB.auxListDB.size(); i17++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i17));
                }
                return;
            case 17:
                this.f34DB.matrizBase17();
                for (int i18 = 0; i18 < this.f34DB.auxListDB.size(); i18++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i18));
                }
                return;
            case 18:
                this.f34DB.matrizBase18();
                for (int i19 = 0; i19 < this.f34DB.auxListDB.size(); i19++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i19));
                }
                return;
            case 19:
                this.f34DB.matrizBase19();
                for (int i20 = 0; i20 < this.f34DB.auxListDB.size(); i20++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i20));
                }
                return;
            case 20:
                this.f34DB.matrizBase20();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 21:
                this.f34DB.matrizBase21();
                for (int i22 = 0; i22 < this.f34DB.auxListDB.size(); i22++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i22));
                }
                return;
            case 22:
                this.f34DB.matrizBase22();
                for (int i23 = 0; i23 < this.f34DB.auxListDB.size(); i23++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i23));
                }
                return;
            case 23:
                this.f34DB.matrizBase23();
                for (int i24 = 0; i24 < this.f34DB.auxListDB.size(); i24++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i24));
                }
                return;
            case 24:
                this.f34DB.matrizBase24();
                for (int i25 = 0; i25 < this.f34DB.auxListDB.size(); i25++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i25));
                }
                return;
            case 25:
                this.f34DB.matrizBase25();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 26:
                this.f34DB.matrizBase26();
                for (int i27 = 0; i27 < this.f34DB.auxListDB.size(); i27++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i27));
                }
                return;
            case 27:
                this.f34DB.matrizBase27();
                for (int i28 = 0; i28 < this.f34DB.auxListDB.size(); i28++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i28));
                }
                return;
            case 28:
                this.f34DB.matrizBase28();
                for (int i29 = 0; i29 < this.f34DB.auxListDB.size(); i29++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i29));
                }
                return;
            case 29:
                this.f34DB.matrizBase29();
                for (int i30 = 0; i30 < this.f34DB.auxListDB.size(); i30++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i30));
                }
                return;
            case 30:
                this.f34DB.matrizBase30();
                for (int i31 = 0; i31 < this.f34DB.auxListDB.size(); i31++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i31));
                }
                return;
            case 31:
                this.f34DB.matrizBase31();
                for (int i32 = 0; i32 < this.f34DB.auxListDB.size(); i32++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i32));
                }
                return;
            case 32:
                this.f34DB.matrizBase32();
                for (int i33 = 0; i33 < this.f34DB.auxListDB.size(); i33++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i33));
                }
                return;
            case 33:
                this.f34DB.matrizBase33();
                for (int i34 = 0; i34 < this.f34DB.auxListDB.size(); i34++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i34));
                }
                return;
            case 34:
                this.f34DB.matrizBase34();
                for (int i35 = 0; i35 < this.f34DB.auxListDB.size(); i35++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i35));
                }
                return;
            case 35:
                this.f34DB.matrizBase35();
                for (int i36 = 0; i36 < this.f34DB.auxListDB.size(); i36++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i36));
                }
                return;
            case 36:
                this.f34DB.matrizBase36();
                for (int i37 = 0; i37 < this.f34DB.auxListDB.size(); i37++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i37));
                }
                return;
            case 37:
                this.f34DB.matrizBase00();
                for (int i38 = 0; i38 < this.f34DB.auxListDB.size(); i38++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i38));
                }
                return;
            default:
        }
    }

    public void llenarUltimoNumero(int numEnJuego) {
        switch (numEnJuego) {
            case 0:
                this.f34DB.matrizBase0();
                for (int i = 0; i < this.f34DB.auxListDB.size(); i++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i));
                }
                return;
            case 1:
                this.f34DB.matrizBase1();
                for (int i2 = 0; i2 < this.f34DB.auxListDB.size(); i2++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i2));
                }
                return;
            case 2:
                this.f34DB.matrizBase2();
                for (int i3 = 0; i3 < this.f34DB.auxListDB.size(); i3++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i3));
                }
                return;
            case 3:
                this.f34DB.matrizBase3();
                for (int i4 = 0; i4 < this.f34DB.auxListDB.size(); i4++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i4));
                }
                return;
            case 4:
                this.f34DB.matrizBase4();
                for (int i5 = 0; i5 < this.f34DB.auxListDB.size(); i5++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i5));
                }
                return;
            case 5:
                this.f34DB.matrizBase5();
                for (int i6 = 0; i6 < this.f34DB.auxListDB.size(); i6++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i6));
                }
                return;
            case 6:
                this.f34DB.matrizBase6();
                for (int i7 = 0; i7 < this.f34DB.auxListDB.size(); i7++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i7));
                }
                return;
            case 7:
                this.f34DB.matrizBase7();
                for (int i8 = 0; i8 < this.f34DB.auxListDB.size(); i8++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i8));
                }
                return;
            case 8:
                this.f34DB.matrizBase8();
                for (int i9 = 0; i9 < this.f34DB.auxListDB.size(); i9++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i9));
                }
                return;
            case 9:
                this.f34DB.matrizBase9();
                for (int i10 = 0; i10 < this.f34DB.auxListDB.size(); i10++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i10));
                }
                return;
            case 10:
                this.f34DB.matrizBase10();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 11:
                this.f34DB.matrizBase11();
                for (int i12 = 0; i12 < this.f34DB.auxListDB.size(); i12++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i12));
                }
                return;
            case 12:
                this.f34DB.matrizBase12();
                for (int i13 = 0; i13 < this.f34DB.auxListDB.size(); i13++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i13));
                }
                return;
            case 13:
                this.f34DB.matrizBase13();
                for (int i14 = 0; i14 < this.f34DB.auxListDB.size(); i14++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i14));
                }
                return;
            case 14:
                this.f34DB.matrizBase14();
                for (int i15 = 0; i15 < this.f34DB.auxListDB.size(); i15++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i15));
                }
                return;
            case 15:
                this.f34DB.matrizBase15();
                for (int i16 = 0; i16 < this.f34DB.auxListDB.size(); i16++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i16));
                }
                return;
            case 16:
                this.f34DB.matrizBase16();
                for (int i17 = 0; i17 < this.f34DB.auxListDB.size(); i17++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i17));
                }
                return;
            case 17:
                this.f34DB.matrizBase17();
                for (int i18 = 0; i18 < this.f34DB.auxListDB.size(); i18++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i18));
                }
                return;
            case 18:
                this.f34DB.matrizBase18();
                for (int i19 = 0; i19 < this.f34DB.auxListDB.size(); i19++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i19));
                }
                return;
            case 19:
                this.f34DB.matrizBase19();
                for (int i20 = 0; i20 < this.f34DB.auxListDB.size(); i20++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i20));
                }
                return;
            case 20:
                this.f34DB.matrizBase20();
                for (int i21 = 0; i21 < this.f34DB.auxListDB.size(); i21++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i21));
                }
                return;
            case 21:
                this.f34DB.matrizBase21();
                for (int i22 = 0; i22 < this.f34DB.auxListDB.size(); i22++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i22));
                }
                return;
            case 22:
                this.f34DB.matrizBase22();
                for (int i23 = 0; i23 < this.f34DB.auxListDB.size(); i23++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i23));
                }
                return;
            case 23:
                this.f34DB.matrizBase23();
                for (int i24 = 0; i24 < this.f34DB.auxListDB.size(); i24++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i24));
                }
                return;
            case 24:
                this.f34DB.matrizBase24();
                listaFinal.addAll(this.f34DB.auxListDB);
                return;
            case 25:
                this.f34DB.matrizBase25();
                for (int i26 = 0; i26 < this.f34DB.auxListDB.size(); i26++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i26));
                }
                return;
            case 26:
                this.f34DB.matrizBase26();
                for (int i27 = 0; i27 < this.f34DB.auxListDB.size(); i27++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i27));
                }
                return;
            case 27:
                this.f34DB.matrizBase27();
                for (int i28 = 0; i28 < this.f34DB.auxListDB.size(); i28++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i28));
                }
                return;
            case 28:
                this.f34DB.matrizBase28();
                for (int i29 = 0; i29 < this.f34DB.auxListDB.size(); i29++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i29));
                }
                return;
            case 29:
                this.f34DB.matrizBase29();
                for (int i30 = 0; i30 < this.f34DB.auxListDB.size(); i30++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i30));
                }
                return;
            case 30:
                this.f34DB.matrizBase30();
                for (int i31 = 0; i31 < this.f34DB.auxListDB.size(); i31++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i31));
                }
                return;
            case 31:
                this.f34DB.matrizBase31();
                for (int i32 = 0; i32 < this.f34DB.auxListDB.size(); i32++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i32));
                }
                return;
            case 32:
                this.f34DB.matrizBase32();
                for (int i33 = 0; i33 < this.f34DB.auxListDB.size(); i33++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i33));
                }
                return;
            case 33:
                this.f34DB.matrizBase33();
                for (int i34 = 0; i34 < this.f34DB.auxListDB.size(); i34++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i34));
                }
                return;
            case 34:
                this.f34DB.matrizBase34();
                for (int i35 = 0; i35 < this.f34DB.auxListDB.size(); i35++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i35));
                }
                return;
            case 35:
                this.f34DB.matrizBase35();
                for (int i36 = 0; i36 < this.f34DB.auxListDB.size(); i36++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i36));
                }
                return;
            case 36:
                this.f34DB.matrizBase36();
                for (int i37 = 0; i37 < this.f34DB.auxListDB.size(); i37++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i37));
                }
                return;
            case 37:
                this.f34DB.matrizBase00();
                for (int i38 = 0; i38 < this.f34DB.auxListDB.size(); i38++) {
                    listaFinal.add(this.f34DB.auxListDB.get(i38));
                }
                return;
            default:
                return;
        }
    }

    public void posibilidadDeApuesta(ArrayList<Integer> numeros) {
        String str;
        int[] contador = new int[38];
        int[] aux = new int[38];
        for (int i = 0; i < 38; i++) {
            for (int j = 0; j < numeros.size(); j++) {
                if (i == ((Integer) numeros.get(j)).intValue()) {
                    contador[i] = contador[i] + 1;
                    aux[i] = aux[i] + 1;
                }
            }
        }
        Arrays.sort(aux);
        HashSet<Integer> numApostar = new HashSet<>();
        ArrayList<Integer> respList = new ArrayList<>();
        for (int j2 = 28; j2 < aux.length; j2++) {
            int auxNum = 0;
            for (int i2 : contador) {
                if (aux[j2] == i2) {
                    numApostar.add(Integer.valueOf(auxNum));
                }
                auxNum++;
            }
        }
        Iterator it = numApostar.iterator();
        while (it.hasNext()) {
            respList.add(Integer.valueOf(((Integer) it.next()).intValue()));
        }
        Collections.sort(respList);
        Iterator it2 = respList.iterator();
        while (true) {
            str = "|";
            if (!it2.hasNext()) {
                break;
            }
            int auxiliar = ((Integer) it2.next()).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(respuesta);
            sb.append(auxiliar);
            sb.append(str);
            respuesta = sb.toString();
        }
        TextView textView = MainActivity.grupo1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(respuesta);
        String str2 = " >total> ";
        sb2.append(str2);
        sb2.append(respList.size());
        textView.setText(sb2.toString());
        numApostar.clear();
        respList.clear();
        respuesta = str;
        for (int j3 = 23; j3 < aux.length; j3++) {
            int auxNum2 = 0;
            for (int i3 : contador) {
                if (aux[j3] == i3) {
                    numApostar.add(Integer.valueOf(auxNum2));
                }
                auxNum2++;
            }
        }
        Iterator it3 = numApostar.iterator();
        while (it3.hasNext()) {
            respList.add(Integer.valueOf(((Integer) it3.next()).intValue()));
        }
        Collections.sort(respList);
        Iterator it4 = respList.iterator();
        while (it4.hasNext()) {
            int auxiliar2 = ((Integer) it4.next()).intValue();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(respuesta);
            sb3.append(auxiliar2);
            sb3.append(str);
            respuesta = sb3.toString();
        }
        TextView textView2 = MainActivity.grupo2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(respuesta);
        sb4.append(str2);
        sb4.append(respList.size());
        textView2.setText(sb4.toString());
        numApostar.clear();
        respList.clear();
        respuesta = str;
        for (int j4 = 18; j4 < aux.length; j4++) {
            int auxNum3 = 0;
            for (int i4 : contador) {
                if (aux[j4] == i4) {
                    numApostar.add(Integer.valueOf(auxNum3));
                }
                auxNum3++;
            }
        }
        Iterator it5 = numApostar.iterator();
        while (it5.hasNext()) {
            respList.add(Integer.valueOf(((Integer) it5.next()).intValue()));
        }
        Collections.sort(respList);
        Iterator it6 = respList.iterator();
        while (it6.hasNext()) {
            int auxiliar3 = ((Integer) it6.next()).intValue();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(respuesta);
            sb5.append(auxiliar3);
            sb5.append(str);
            respuesta = sb5.toString();
        }
        TextView textView3 = MainActivity.grupo3;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(respuesta);
        sb6.append(str2);
        sb6.append(respList.size());
        textView3.setText(sb6.toString());
        numApostar.clear();
        respList.clear();
        respuesta = str;
    }
}
