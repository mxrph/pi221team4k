package team4;

import team4.Uslovie;

public class Standart extends Uslovie   {

         @Override
     		 public float calculation(int summa_try, int mesyac_try, int dosr_try) {
        	 float procMin; // ���������� ���������� ������������ ��������
        	 float procMax; // ���������� ���������� ������������� ��������
        	 float procRaznica; // ���������� ���������� �������������� �������
        	 float procMes; // ���������� ���������� ��������� ��������

        	 if(summa_try < 250001) { //������� ������� ��������, ������� ������� �� �����
        		 procMin = (float) 16.99;
        		 procMax = (float) 23.49;
        		 procRaznica = procMax - procMin; // ������ �������
        	 } else if (summa_try < 700001) { //������� ������� ��������, ������� ������� �� �����
        		 procMin = (float) 14.99;
        		 procMax = (float) 18.99;
        		 procRaznica = procMax - procMin; // ������ �������
        	 } else {
        		 procMin = (float) 11.99;
        		 procMax = (float) 18.99;
        		 procRaznica = procMax - procMin; // ������ �������
        	 }
        	 procMes = procRaznica/48; // ���������� ������������ ��������, ��� ���������� ��������� ��������
        	 proc = (float) (procMax - procMes*(mesyac_try - 12));
        	 dosr(dosr_try);
		       mproc = proc/1200; // ���������� ������������ ��������
		       mesyac = (float) (summa_try*(mproc+(mproc/(((Math.pow(1 + mproc, mesyac_try)))-1)))); // ������� ���������� ������������ �������
		       pereplata = mesyac * mesyac_try - summa_try; // ���������� ���������
		       itog = summa_try + pereplata; // ����� ����� �������
		       itog = (int)(itog*100);
		       itog = itog/100;
			return itog;
			
         }
      
}