package ejercicio3interfaces;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas{
	
	public double num[];
	
	
	
	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + ", r=" + r + "]";
	}


	public double[] getNum() {
		return num;
	}


	public void setNum(double[] num) {
		this.num = num;
	}


	public Random getR() {
		return r;
	}


	public void setR(Random r) {
		this.r = r;
	}


	public ArrayReales(double[] num, Random r) {
		super();
		this.num = num;
		this.r = r;
	}


	Random r = new Random();
	
	
	public ArrayReales(int size, double minValue, double maxValue) {
        num = new double[size];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = minValue + (maxValue - minValue) * random.nextDouble();
        }
    }


	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calcularMaximo() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double calcularSumatorio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
