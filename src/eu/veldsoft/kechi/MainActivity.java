package eu.veldsoft.kechi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import eu.veldsoft.kechi.model.Board;
import eu.veldsoft.kechi.model.Cell;

public class MainActivity extends Activity {
	/**
	 * Image references.
	 */
	private ImageView images[][] = new ImageView[Board.SIZE][Board.SIZE];

	/**
	 * Board object as object composition.
	 */
	private Board board = new Board();

	/**
	 * Update all views according object model.
	 */
	private void updateViews() {
		Cell cells[][] = board.getCells();
		for (int i = 0; i < cells.length && i < images.length; i++) {
			for (int j = 0; j < cells[i].length && j < images[i].length; j++) {
				switch (cells[i][j]) {
				case EMPTY:
					images[i][j].setImageResource(R.drawable.empty);
					break;
				case UNAVAILABLE:
					images[i][j].setImageResource(R.drawable.empty);
					break;
				case AVAILABLE:
					images[i][j].setImageResource(R.drawable.white);
					break;
				case RED:
					images[i][j].setImageResource(R.drawable.fuchsia);
					break;
				case BLUE:
					images[i][j].setImageResource(R.drawable.blue);
					break;
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		images[0][0] = (ImageView) findViewById(R.id.cell0000);
		images[0][1] = (ImageView) findViewById(R.id.cell0001);
		images[0][2] = (ImageView) findViewById(R.id.cell0002);
		images[0][3] = (ImageView) findViewById(R.id.cell0003);
		images[0][4] = (ImageView) findViewById(R.id.cell0004);
		images[0][5] = (ImageView) findViewById(R.id.cell0005);
		images[0][6] = (ImageView) findViewById(R.id.cell0006);
		images[0][7] = (ImageView) findViewById(R.id.cell0007);
		images[0][8] = (ImageView) findViewById(R.id.cell0008);
		images[0][9] = (ImageView) findViewById(R.id.cell0009);
		images[0][10] = (ImageView) findViewById(R.id.cell0010);
		images[0][11] = (ImageView) findViewById(R.id.cell0011);
		images[0][12] = (ImageView) findViewById(R.id.cell0012);

		images[1][0] = (ImageView) findViewById(R.id.cell0100);
		images[1][1] = (ImageView) findViewById(R.id.cell0101);
		images[1][2] = (ImageView) findViewById(R.id.cell0102);
		images[1][3] = (ImageView) findViewById(R.id.cell0103);
		images[1][4] = (ImageView) findViewById(R.id.cell0104);
		images[1][5] = (ImageView) findViewById(R.id.cell0105);
		images[1][6] = (ImageView) findViewById(R.id.cell0106);
		images[1][7] = (ImageView) findViewById(R.id.cell0107);
		images[1][8] = (ImageView) findViewById(R.id.cell0108);
		images[1][9] = (ImageView) findViewById(R.id.cell0109);
		images[1][10] = (ImageView) findViewById(R.id.cell0110);
		images[1][11] = (ImageView) findViewById(R.id.cell0111);
		images[1][12] = (ImageView) findViewById(R.id.cell0112);

		images[2][0] = (ImageView) findViewById(R.id.cell0200);
		images[2][1] = (ImageView) findViewById(R.id.cell0201);
		images[2][2] = (ImageView) findViewById(R.id.cell0202);
		images[2][3] = (ImageView) findViewById(R.id.cell0203);
		images[2][4] = (ImageView) findViewById(R.id.cell0204);
		images[2][5] = (ImageView) findViewById(R.id.cell0205);
		images[2][6] = (ImageView) findViewById(R.id.cell0206);
		images[2][7] = (ImageView) findViewById(R.id.cell0207);
		images[2][8] = (ImageView) findViewById(R.id.cell0208);
		images[2][9] = (ImageView) findViewById(R.id.cell0209);
		images[2][10] = (ImageView) findViewById(R.id.cell0210);
		images[2][11] = (ImageView) findViewById(R.id.cell0211);
		images[2][12] = (ImageView) findViewById(R.id.cell0212);

		images[3][0] = (ImageView) findViewById(R.id.cell0300);
		images[3][1] = (ImageView) findViewById(R.id.cell0301);
		images[3][2] = (ImageView) findViewById(R.id.cell0302);
		images[3][3] = (ImageView) findViewById(R.id.cell0303);
		images[3][4] = (ImageView) findViewById(R.id.cell0304);
		images[3][5] = (ImageView) findViewById(R.id.cell0305);
		images[3][6] = (ImageView) findViewById(R.id.cell0306);
		images[3][7] = (ImageView) findViewById(R.id.cell0307);
		images[3][8] = (ImageView) findViewById(R.id.cell0308);
		images[3][9] = (ImageView) findViewById(R.id.cell0309);
		images[3][10] = (ImageView) findViewById(R.id.cell0310);
		images[3][11] = (ImageView) findViewById(R.id.cell0311);
		images[3][12] = (ImageView) findViewById(R.id.cell0312);

		images[4][0] = (ImageView) findViewById(R.id.cell0400);
		images[4][1] = (ImageView) findViewById(R.id.cell0401);
		images[4][2] = (ImageView) findViewById(R.id.cell0402);
		images[4][3] = (ImageView) findViewById(R.id.cell0403);
		images[4][4] = (ImageView) findViewById(R.id.cell0404);
		images[4][5] = (ImageView) findViewById(R.id.cell0405);
		images[4][6] = (ImageView) findViewById(R.id.cell0406);
		images[4][7] = (ImageView) findViewById(R.id.cell0407);
		images[4][8] = (ImageView) findViewById(R.id.cell0408);
		images[4][9] = (ImageView) findViewById(R.id.cell0409);
		images[4][10] = (ImageView) findViewById(R.id.cell0410);
		images[4][11] = (ImageView) findViewById(R.id.cell0411);
		images[4][12] = (ImageView) findViewById(R.id.cell0412);

		images[5][0] = (ImageView) findViewById(R.id.cell0500);
		images[5][1] = (ImageView) findViewById(R.id.cell0501);
		images[5][2] = (ImageView) findViewById(R.id.cell0502);
		images[5][3] = (ImageView) findViewById(R.id.cell0503);
		images[5][4] = (ImageView) findViewById(R.id.cell0504);
		images[5][5] = (ImageView) findViewById(R.id.cell0505);
		images[5][6] = (ImageView) findViewById(R.id.cell0506);
		images[5][7] = (ImageView) findViewById(R.id.cell0507);
		images[5][8] = (ImageView) findViewById(R.id.cell0508);
		images[5][9] = (ImageView) findViewById(R.id.cell0509);
		images[5][10] = (ImageView) findViewById(R.id.cell0510);
		images[5][11] = (ImageView) findViewById(R.id.cell0511);
		images[5][12] = (ImageView) findViewById(R.id.cell0512);

		images[6][0] = (ImageView) findViewById(R.id.cell0600);
		images[6][1] = (ImageView) findViewById(R.id.cell0601);
		images[6][2] = (ImageView) findViewById(R.id.cell0602);
		images[6][3] = (ImageView) findViewById(R.id.cell0603);
		images[6][4] = (ImageView) findViewById(R.id.cell0604);
		images[6][5] = (ImageView) findViewById(R.id.cell0605);
		images[6][6] = (ImageView) findViewById(R.id.cell0606);
		images[6][7] = (ImageView) findViewById(R.id.cell0607);
		images[6][8] = (ImageView) findViewById(R.id.cell0608);
		images[6][9] = (ImageView) findViewById(R.id.cell0609);
		images[6][10] = (ImageView) findViewById(R.id.cell0610);
		images[6][11] = (ImageView) findViewById(R.id.cell0611);
		images[6][12] = (ImageView) findViewById(R.id.cell0612);

		images[7][0] = (ImageView) findViewById(R.id.cell0700);
		images[7][1] = (ImageView) findViewById(R.id.cell0701);
		images[7][2] = (ImageView) findViewById(R.id.cell0702);
		images[7][3] = (ImageView) findViewById(R.id.cell0703);
		images[7][4] = (ImageView) findViewById(R.id.cell0704);
		images[7][5] = (ImageView) findViewById(R.id.cell0705);
		images[7][6] = (ImageView) findViewById(R.id.cell0706);
		images[7][7] = (ImageView) findViewById(R.id.cell0707);
		images[7][8] = (ImageView) findViewById(R.id.cell0708);
		images[7][9] = (ImageView) findViewById(R.id.cell0709);
		images[7][10] = (ImageView) findViewById(R.id.cell0710);
		images[7][11] = (ImageView) findViewById(R.id.cell0711);
		images[7][12] = (ImageView) findViewById(R.id.cell0712);

		images[8][0] = (ImageView) findViewById(R.id.cell0800);
		images[8][1] = (ImageView) findViewById(R.id.cell0801);
		images[8][2] = (ImageView) findViewById(R.id.cell0802);
		images[8][3] = (ImageView) findViewById(R.id.cell0803);
		images[8][4] = (ImageView) findViewById(R.id.cell0804);
		images[8][5] = (ImageView) findViewById(R.id.cell0805);
		images[8][6] = (ImageView) findViewById(R.id.cell0806);
		images[8][7] = (ImageView) findViewById(R.id.cell0807);
		images[8][8] = (ImageView) findViewById(R.id.cell0808);
		images[8][9] = (ImageView) findViewById(R.id.cell0809);
		images[8][10] = (ImageView) findViewById(R.id.cell0810);
		images[8][11] = (ImageView) findViewById(R.id.cell0811);
		images[8][12] = (ImageView) findViewById(R.id.cell0812);

		images[9][0] = (ImageView) findViewById(R.id.cell0900);
		images[9][1] = (ImageView) findViewById(R.id.cell0901);
		images[9][2] = (ImageView) findViewById(R.id.cell0902);
		images[9][3] = (ImageView) findViewById(R.id.cell0903);
		images[9][4] = (ImageView) findViewById(R.id.cell0904);
		images[9][5] = (ImageView) findViewById(R.id.cell0905);
		images[9][6] = (ImageView) findViewById(R.id.cell0906);
		images[9][7] = (ImageView) findViewById(R.id.cell0907);
		images[9][8] = (ImageView) findViewById(R.id.cell0908);
		images[9][9] = (ImageView) findViewById(R.id.cell0909);
		images[9][10] = (ImageView) findViewById(R.id.cell0910);
		images[9][11] = (ImageView) findViewById(R.id.cell0911);
		images[9][12] = (ImageView) findViewById(R.id.cell0912);

		images[10][0] = (ImageView) findViewById(R.id.cell1000);
		images[10][1] = (ImageView) findViewById(R.id.cell1001);
		images[10][2] = (ImageView) findViewById(R.id.cell1002);
		images[10][3] = (ImageView) findViewById(R.id.cell1003);
		images[10][4] = (ImageView) findViewById(R.id.cell1004);
		images[10][5] = (ImageView) findViewById(R.id.cell1005);
		images[10][6] = (ImageView) findViewById(R.id.cell1006);
		images[10][7] = (ImageView) findViewById(R.id.cell1007);
		images[10][8] = (ImageView) findViewById(R.id.cell1008);
		images[10][9] = (ImageView) findViewById(R.id.cell1009);
		images[10][10] = (ImageView) findViewById(R.id.cell1010);
		images[10][11] = (ImageView) findViewById(R.id.cell1011);
		images[10][12] = (ImageView) findViewById(R.id.cell1012);

		images[11][0] = (ImageView) findViewById(R.id.cell1100);
		images[11][1] = (ImageView) findViewById(R.id.cell1101);
		images[11][2] = (ImageView) findViewById(R.id.cell1102);
		images[11][3] = (ImageView) findViewById(R.id.cell1103);
		images[11][4] = (ImageView) findViewById(R.id.cell1104);
		images[11][5] = (ImageView) findViewById(R.id.cell1105);
		images[11][6] = (ImageView) findViewById(R.id.cell1106);
		images[11][7] = (ImageView) findViewById(R.id.cell1107);
		images[11][8] = (ImageView) findViewById(R.id.cell1108);
		images[11][9] = (ImageView) findViewById(R.id.cell1109);
		images[11][10] = (ImageView) findViewById(R.id.cell1110);
		images[11][11] = (ImageView) findViewById(R.id.cell1111);
		images[11][12] = (ImageView) findViewById(R.id.cell1112);

		images[12][0] = (ImageView) findViewById(R.id.cell1200);
		images[12][1] = (ImageView) findViewById(R.id.cell1201);
		images[12][2] = (ImageView) findViewById(R.id.cell1202);
		images[12][3] = (ImageView) findViewById(R.id.cell1203);
		images[12][4] = (ImageView) findViewById(R.id.cell1204);
		images[12][5] = (ImageView) findViewById(R.id.cell1205);
		images[12][6] = (ImageView) findViewById(R.id.cell1206);
		images[12][7] = (ImageView) findViewById(R.id.cell1207);
		images[12][8] = (ImageView) findViewById(R.id.cell1208);
		images[12][9] = (ImageView) findViewById(R.id.cell1209);
		images[12][10] = (ImageView) findViewById(R.id.cell1210);
		images[12][11] = (ImageView) findViewById(R.id.cell1211);
		images[12][12] = (ImageView) findViewById(R.id.cell1212);
		
		updateViews();
	}
}
