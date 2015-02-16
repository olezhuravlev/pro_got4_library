package pro.got4.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class ExpressRevision_DemoItems {

	public static String TABLE_DOCS_NAME;
	public static String TABLE_ITEMS_NAME;

	public static String TABLE_DOCS_DEMO_NAME;
	public static String TABLE_ITEMS_DEMO_NAME;

	public static String FIELD_DOC_ID_NAME;
	public static String FIELD_INDEX_NAME;

	public static String FIELD_DOC_NUM_NAME;
	public static String FIELD_DOC_DATE_NAME;
	public static String FIELD_STORE_CODE_NAME;
	public static String FIELD_STORE_DESCR_NAME;
	public static String FIELD_DOC_COMMENT_NAME;
	public static String FIELD_DOC_ROWS_NAME;

	public static String FIELD_ROW_NUM_NAME;
	public static String FIELD_ITEM_CODE_NAME;
	public static String FIELD_ITEM_DESCR_NAME;
	public static String FIELD_ITEM_DESCR_FULL_NAME;
	public static String FIELD_ITEM_USE_SPECIF_NAME;
	public static String FIELD_MEASUR_DESCR_NAME;
	public static String FIELD_PRICE_NAME;
	public static String FIELD_QUANT_ACC_NAME;
	public static String FIELD_QUANT_NAME;
	public static String FIELD_SPECIF_CODE_NAME;
	public static String FIELD_SPECIF_DESCR_NAME;

	// Форматтер даты для преобразования в формат, понятный пользователю.
	public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(
			"dd.MM.yyyy HH:mm:ss", Locale.getDefault());

	// Форматтер даты для приведения даты к формату, используемому в
	// идентификаторе документа.
	public static final SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss", Locale.getDefault());

	/**
	 * Заполняет БД демонстрационным набором номенклатуры.
	 * 
	 * @throws ParseException
	 */
	public static void installDemoItems(SQLiteDatabase dataBase) {

		// ///////////////////////////////////////
		// Таблица демо-документов.
		ContentValues docsValues = new ContentValues();

		// SimpleDateFormat formatter = new SimpleDateFormat(
		// "yyyy-MM-dd HH:mm:ss", Locale.getDefault());

		long insertedRowId;
		try {

			docsValues.put(FIELD_DOC_NUM_NAME, "ЭКС00000010");
			docsValues.put(FIELD_DOC_DATE_NAME,
					formatter.parse("2014-12-30 12:06:41").getTime());
			docsValues.put(FIELD_STORE_CODE_NAME, "1");
			docsValues.put(FIELD_STORE_DESCR_NAME, "1 киоск");
			docsValues.put(FIELD_DOC_COMMENT_NAME, "Товары без характеристик.");
			docsValues.put(FIELD_DOC_ROWS_NAME, 15);
			docsValues.put(
					FIELD_DOC_ID_NAME,
					getDocId(docsValues.getAsString(FIELD_DOC_NUM_NAME),
							docsValues.getAsLong(FIELD_DOC_DATE_NAME)));
			insertedRowId = insert(dataBase, TABLE_DOCS_DEMO_NAME, docsValues);

			docsValues.put(FIELD_DOC_NUM_NAME, "ЭКС00000152");
			docsValues.put(FIELD_DOC_DATE_NAME,
					formatter.parse("2014-12-31 09:03:11").getTime());
			docsValues.put(FIELD_STORE_CODE_NAME, "25");
			docsValues.put(FIELD_STORE_DESCR_NAME, "25 киоск");
			docsValues
					.put(FIELD_DOC_COMMENT_NAME, "Товары с характеристиками.");
			docsValues.put(FIELD_DOC_ROWS_NAME, 15);
			docsValues.put(
					FIELD_DOC_ID_NAME,
					getDocId(docsValues.getAsString(FIELD_DOC_NUM_NAME),
							docsValues.getAsLong(FIELD_DOC_DATE_NAME)));
			insertedRowId = insert(dataBase, TABLE_DOCS_DEMO_NAME, docsValues);

			docsValues.put(FIELD_DOC_NUM_NAME, "ЭКС00000003");
			docsValues.put(FIELD_DOC_DATE_NAME,
					formatter.parse("2015-01-04 18:25:39").getTime());
			docsValues.put(FIELD_STORE_DESCR_NAME, "106 киоск");
			docsValues.put(FIELD_STORE_CODE_NAME, "106");
			docsValues.put(FIELD_DOC_COMMENT_NAME,
					"Товары с характеристиками и без.");
			docsValues.put(FIELD_DOC_ROWS_NAME, 15);
			docsValues.put(
					FIELD_DOC_ID_NAME,
					getDocId(docsValues.getAsString(FIELD_DOC_NUM_NAME),
							docsValues.getAsLong(FIELD_DOC_DATE_NAME)));
			insertedRowId = insert(dataBase, TABLE_DOCS_DEMO_NAME, docsValues);

			docsValues.put(FIELD_DOC_NUM_NAME, "ЭКС00000004");
			docsValues.put(FIELD_DOC_DATE_NAME,
					formatter.parse("2015-01-05 01:00:01").getTime());
			docsValues.put(FIELD_STORE_CODE_NAME, "204");
			docsValues.put(FIELD_STORE_DESCR_NAME, "204 киоск");
			docsValues.put(FIELD_DOC_COMMENT_NAME, "Кола.");
			docsValues.put(FIELD_DOC_ROWS_NAME, 15);
			docsValues.put(
					FIELD_DOC_ID_NAME,
					getDocId(docsValues.getAsString(FIELD_DOC_NUM_NAME),
							docsValues.getAsLong(FIELD_DOC_DATE_NAME)));
			insertedRowId = insert(dataBase, TABLE_DOCS_DEMO_NAME, docsValues);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		// ///////////////////////////////////////
		// Таблица номенклатуры демо-документов.
		ContentValues itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 1);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я7032");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "*бланк Доверенность А5 №М2");
		itemValues
				.put(FIELD_ITEM_DESCR_FULL_NAME, "*бланк Доверенность А5 №М2");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 10);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 2);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я1118");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Автодокументы иск. кожа РП");
		itemValues
				.put(FIELD_ITEM_DESCR_FULL_NAME, "Автодокументы иск. кожа РП");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 62);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 3);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я5418");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Альбом д/рисов 16л");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Альбом д/рисов 16л");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 23);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 4);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27522");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"жр Орбит белоснежный фруктовый коктейль *600");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Орбит белоснежн. фр.коктейль");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 18.5);
		itemValues.put(FIELD_QUANT_ACC_NAME, 60);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 5);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27522");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"жр Орбит белоснежный фруктовый коктейль *600");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Орбит белоснежн. фр.коктейль");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 20);
		itemValues.put(FIELD_QUANT_ACC_NAME, 120);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 6);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27522");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"жр Орбит белоснежный фруктовый коктейль *600");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Орбит белоснежн. фр.коктейль");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 21);
		itemValues.put(FIELD_QUANT_ACC_NAME, 30);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 7);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я2554");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Кисть белка №1/2 кругл.");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Кисть белка");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 15);
		itemValues.put(FIELD_QUANT_ACC_NAME, 5);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 8);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я5799");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Н14 Украшение Бабочка на клипе");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Н14 Украшение Бабочка на клипе");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 22);
		itemValues.put(FIELD_QUANT_ACC_NAME, 11);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 9);
		itemValues.put(FIELD_ITEM_CODE_NAME, "яа0179");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Н15 Гирлянда свечки эл. 100 ламп (белый)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Гирлянда эл. 100 ламп (белый)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 150);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 10);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я8687");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Эл. Испаритель Понс Ароматный кофе");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Эл. Испаритель Понс");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 117);
		itemValues.put(FIELD_QUANT_ACC_NAME, 5);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 11);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я7726");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Эл.Испаритель Понс Дикая вишня");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Эл. Испаритель Понс");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 117);
		itemValues.put(FIELD_QUANT_ACC_NAME, 5);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 12);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я7727");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Эл.Испаритель Понс Классик");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Эл. Испаритель Понс");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 117);
		itemValues.put(FIELD_QUANT_ACC_NAME, 5);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 13);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я6595");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "эл.сиг.Вишня Low");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "эл.сиг.Вишня Low");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 90);
		itemValues.put(FIELD_QUANT_ACC_NAME, 2);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 14);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я6592");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "эл.сиг.Табак High");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "эл.сиг.Табак High");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 90);
		itemValues.put(FIELD_QUANT_ACC_NAME, 2);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-30 12:06:41ЭКС00000010");
		itemValues.put(FIELD_ROW_NUM_NAME, 15);
		itemValues.put(FIELD_ITEM_CODE_NAME, "я6590");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "эл.сиг.Табак Med");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "эл.сиг.Табак Med");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 90);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 1);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0795");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 52081);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "6/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 25);
		itemValues.put(FIELD_QUANT_ACC_NAME, 5);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 2);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0795");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 53635);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "7/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 25);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 3);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0795");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Дарья БИОГРАФИЯ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 55092);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "8/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 25);
		itemValues.put(FIELD_QUANT_ACC_NAME, 9);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 4);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0797");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "Жизнь и любовь");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "Жизнь и любовь");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 55898);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "8/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 19);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 5);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0718");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 41519);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "1/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 23);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 6);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0718");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 41519);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "1/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 23.5);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 7);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0718");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"КРОССВОРДЫ от Потапыча  2012 Спецвыпуск 777");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 51231);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "3/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 23);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 8);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0725");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 44079);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "5/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 35);
		itemValues.put(FIELD_QUANT_ACC_NAME, 2);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 9);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0725");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 55185);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "15/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 37);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 10);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0725");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 56245);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "16/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 37);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 11);
		itemValues.put(FIELD_ITEM_CODE_NAME, "Ж0725");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ОБЕРЕГИ и ТАЛИСМАНЫ Спецвыпуск газеты");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 42999);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "4/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 33);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 12);
		itemValues.put(FIELD_ITEM_CODE_NAME, "6294");
		itemValues
				.put(FIELD_ITEM_DESCR_NAME, "Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 39501);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "1/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 13);
		itemValues.put(FIELD_ITEM_CODE_NAME, "6294");
		itemValues
				.put(FIELD_ITEM_DESCR_NAME, "Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 16792);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "4/12");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 20);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 14);
		itemValues.put(FIELD_ITEM_CODE_NAME, "6294");
		itemValues
				.put(FIELD_ITEM_DESCR_NAME, "Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 13375);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "3/12");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 20);
		itemValues.put(FIELD_QUANT_ACC_NAME, 6);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2014-12-31 09:03:11ЭКС00000152");
		itemValues.put(FIELD_ROW_NUM_NAME, 15);
		itemValues.put(FIELD_ITEM_CODE_NAME, "6294");
		itemValues
				.put(FIELD_ITEM_DESCR_NAME, "Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Садовод и огородник. Спецвыпуск");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 31924);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "3/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 1);
		itemValues.put(FIELD_ITEM_CODE_NAME, "1623");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 22152);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "3/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 4);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 2);
		itemValues.put(FIELD_ITEM_CODE_NAME, "1623");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 52847);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "19/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 4);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 3);
		itemValues.put(FIELD_ITEM_CODE_NAME, "1623");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 25134);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "7/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 4);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 4);
		itemValues.put(FIELD_ITEM_CODE_NAME, "1623");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 25134);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "7/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 18);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 5);
		itemValues.put(FIELD_ITEM_CODE_NAME, "1623");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1000 СЕКРЕТОВ");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 41654);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "4/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 16);
		itemValues.put(FIELD_QUANT_ACC_NAME, 4);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 6);
		itemValues.put(FIELD_ITEM_CODE_NAME, "28301");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ав драже Виталайф Калинка витаминизирован.50г");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ав драже Виталайф Калинка витаминизирован.50г");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 55);
		itemValues.put(FIELD_QUANT_ACC_NAME, 2);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 7);
		itemValues.put(FIELD_ITEM_CODE_NAME, "28307");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"ав напиток Виталайф черноплодноря витамин  сухой30");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"ав напиток Виталайф черноплоднорябиновый витамин  сухой30");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 120);
		itemValues.put(FIELD_QUANT_ACC_NAME, 1);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 8);
		itemValues.put(FIELD_ITEM_CODE_NAME, "28555");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Арахис холодец с хреном 70гр 10шт *20");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Арахис холодец с хреном 70гр");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 24);
		itemValues.put(FIELD_QUANT_ACC_NAME, 35);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 9);
		itemValues.put(FIELD_ITEM_CODE_NAME, "28555");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Арахис холодец с хреном 70гр 10шт *20");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Арахис холодец с хреном 70гр");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 23);
		itemValues.put(FIELD_QUANT_ACC_NAME, 9);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 10);
		itemValues.put(FIELD_ITEM_CODE_NAME, "28130");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"бат КИНГ сайз Кит Кат 68г 4*24=96  М");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "бат.Кит Кат кинг сайз 68г");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 34);
		itemValues.put(FIELD_QUANT_ACC_NAME, 831);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 11);
		itemValues.put(FIELD_ITEM_CODE_NAME, "8596");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 41778);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "8/14");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 32);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 12);
		itemValues.put(FIELD_ITEM_CODE_NAME, "8596");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 3714);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "6/12");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 32);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 13);
		itemValues.put(FIELD_ITEM_CODE_NAME, "8596");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 39098);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "52/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 32);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 14);
		itemValues.put(FIELD_ITEM_CODE_NAME, "8596");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 36448);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "45/13");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 32);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-04 18:25:39ЭКС00000003");
		itemValues.put(FIELD_ROW_NUM_NAME, 15);
		itemValues.put(FIELD_ITEM_CODE_NAME, "8596");
		itemValues.put(FIELD_ITEM_DESCR_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME,
				"Экспресс газета                        (Роспечать)");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 1);
		itemValues.put(FIELD_SPECIF_CODE_NAME, 1637);
		itemValues.put(FIELD_SPECIF_DESCR_NAME, "3/12");
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 32);
		itemValues.put(FIELD_QUANT_ACC_NAME, 3);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 1);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 33.5);
		itemValues.put(FIELD_QUANT_ACC_NAME, 24);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 2);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 34.5);
		itemValues.put(FIELD_QUANT_ACC_NAME, 495);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 3);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 35.5);
		itemValues.put(FIELD_QUANT_ACC_NAME, 48);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 4);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 44);
		itemValues.put(FIELD_QUANT_ACC_NAME, 120);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 5);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 48);
		itemValues.put(FIELD_QUANT_ACC_NAME, 9);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 6);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27117");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "0,5 спрайт бутылка  *24");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 49);
		itemValues.put(FIELD_QUANT_ACC_NAME, 36);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 7);
		itemValues.put(FIELD_ITEM_CODE_NAME, "26997");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л кока  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л кока-кола");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 44);
		itemValues.put(FIELD_QUANT_ACC_NAME, 149);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 8);
		itemValues.put(FIELD_ITEM_CODE_NAME, "26997");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л кока  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л кока-кола");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 53);
		itemValues.put(FIELD_QUANT_ACC_NAME, 258);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 9);
		itemValues.put(FIELD_ITEM_CODE_NAME, "26997");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л кока  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л кока-кола");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 56);
		itemValues.put(FIELD_QUANT_ACC_NAME, 300);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 10);
		itemValues.put(FIELD_ITEM_CODE_NAME, "26997");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л кока  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л кока-кола");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 60);
		itemValues.put(FIELD_QUANT_ACC_NAME, 96);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 11);
		itemValues.put(FIELD_ITEM_CODE_NAME, "26997");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л кока  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л кока-кола");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 61);
		itemValues.put(FIELD_QUANT_ACC_NAME, 72);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 12);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27114");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л спрайт  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л спрайт");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 44);
		itemValues.put(FIELD_QUANT_ACC_NAME, 24);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 13);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27114");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л спрайт  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л спрайт");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 56);
		itemValues.put(FIELD_QUANT_ACC_NAME, 132);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 14);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27114");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л спрайт  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л спрайт");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 60);
		itemValues.put(FIELD_QUANT_ACC_NAME, 24);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);

		itemValues = new ContentValues();
		itemValues.put(FIELD_DOC_ID_NAME, "2015-01-05 01:00:01ЭКС00000004");
		itemValues.put(FIELD_ROW_NUM_NAME, 15);
		itemValues.put(FIELD_ITEM_CODE_NAME, "27114");
		itemValues.put(FIELD_ITEM_DESCR_NAME, "1л спрайт  бутылка  *12");
		itemValues.put(FIELD_ITEM_DESCR_FULL_NAME, "1л спрайт");
		itemValues.put(FIELD_ITEM_USE_SPECIF_NAME, 0);
		itemValues.put(FIELD_MEASUR_DESCR_NAME, "шт");
		itemValues.put(FIELD_PRICE_NAME, 61);
		itemValues.put(FIELD_QUANT_ACC_NAME, 12);
		itemValues.put(FIELD_QUANT_NAME, 0);
		insertedRowId = insert(dataBase, TABLE_ITEMS_DEMO_NAME, itemValues);
	}

	/**
	 * Формирование идентификатора документа.
	 */
	private static String getDocId(String docNum, String docDate) {
		return docDate.concat(docNum);
	}

	/**
	 * Формирование идентификатора документа.
	 */
	private static String getDocId(String docNum, long docDate) {

		String docDateString = formatter.format(docDate);
		return getDocId(docNum, docDateString);
	}

	/**
	 * Добавление записи в БД. В зависимости от таблицы используется разный
	 * набор полей, формирующих поле поиска.
	 * 
	 * @param dataBase
	 * @param tableName
	 * @param values
	 * @return
	 */
	// Эта версия используется при первоначальной инициализации БД.
	private static long insert(SQLiteDatabase dataBase, String tableName,
			ContentValues values) {

		// Добавление поля, используемого для поиска.
		addItemIndexField(tableName, values);

		return dataBase.insert(tableName, null, values);
	}

	/**
	 * Дополняет коллекцию ContentValues индексным полем.<br>
	 * Индексное поле добавляется только в том случае, если его в коллекции еще
	 * нет.
	 * 
	 * @param values
	 * @return String, которой было заполнено индексное поле.
	 */
	private static String addItemIndexField(String tableName,
			ContentValues values) {

		String indexValue = (String) values.get(FIELD_INDEX_NAME);

		if (indexValue != null)
			return indexValue;

		String[] indexFields = null;
		if (tableName.equals(TABLE_DOCS_NAME)) {

			indexFields = new String[] { FIELD_DOC_NUM_NAME,
					FIELD_DOC_DATE_NAME, FIELD_DOC_COMMENT_NAME,
					FIELD_STORE_DESCR_NAME };

		} else if (tableName.equals(TABLE_ITEMS_NAME)) {

			indexFields = new String[] { FIELD_ITEM_CODE_NAME,
					FIELD_ITEM_DESCR_NAME, FIELD_ITEM_DESCR_FULL_NAME,
					FIELD_SPECIF_CODE_NAME, FIELD_SPECIF_DESCR_NAME };

		}

		indexValue = getContentValuesString(values, indexFields, true)
				.toLowerCase(Locale.getDefault());

		values.put(FIELD_INDEX_NAME, indexValue);

		return indexValue;
	}

	/**
	 * Возвращает содержимое коллекции ContentValues в виде строки.<br>
	 * Используется при заполнении поля поиска.
	 * 
	 * @param values
	 * @param keys
	 * @param uniqueOnly
	 *            - флаг того, что в строку нужно добавлять только уникальные
	 *            значения.
	 * @return
	 */
	private static String getContentValuesString(ContentValues values,
			String[] keys, boolean uniqueOnly) {

		String result = "";

		if (keys == null)
			return result;

		for (int i = 0; i < keys.length; i++) {

			String fieldName = keys[i];
			String currentValue = "";

			// Преобразование даты документа в читаемый формат.
			if (fieldName.equals(FIELD_DOC_DATE_NAME)) {
				long gmt = values.getAsLong(fieldName);
				currentValue = dateFormatter.format(gmt);
			} else {
				currentValue = values.getAsString(fieldName);
			}

			if (currentValue != null) {
				if (uniqueOnly) {
					if (result.indexOf(currentValue) == -1) {
						result += currentValue;
					}
				} else {
					result += currentValue;
				}
			}
		}

		return result;
	}
}
