package team4;

	public class DliaSotrudnikov extends Uslovie {
		
		@Override
		public float calculation(int summa_try, int mesyac_try, int dosr_try) {
			float procMin; // ���������� ���������� ������������ ��������
			float procMax; // ���������� ���������� ������������� ��������
			float procRaznica; // ���������� ����������, ������� ������������ �������
			float procMes; // ���������� ���������� ��������� ��������

			if(summa_try < 250001) { //������� ������� ��������, ������� ������� �� �����
				procMin = (float) 15.99;
				procMax = (float) 23.49;
				procRaznica = procMax - procMin;// ������ �������
			} else if (summa_try < 700001) {//������� ������� ��������, ������� ������� �� �����
				procMin = (float) 13.99;
				procMax = (float) 18.99;
				procRaznica = procMax - procMin;// ������ �������
			} else {
				procMin = (float) 11.99;
				procMax = (float) 18.99;
				procRaznica = procMax - procMin;// ������ �������

            }
			procMes = procRaznica/48;// ���������� ������������ ��������, ��� ���������� ��������� ��������
			proc = (float) (procMax - procMes*(mesyac_try - 12));
		    dosr(dosr_try);
		       this.mproc = proc/1200; // ���������� ������������ ��������
		       this.mesyac = (float) (summa_try*(mproc+(mproc/(((Math.pow(1 + mproc, mesyac_try)))-1)))); // ������� ���������� ������������ �������
		       this.pereplata = mesyac * mesyac_try - summa_try; // ���������� ���������
		       this.itog = summa_try + pereplata;
		       itog = (int)(itog*100);
		       itog = itog/100;
		       return itog;
		    
		       }
	}
	

	
