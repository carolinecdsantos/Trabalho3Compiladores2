// Generated from C:\Users\Carol\Desktop\T3\src\t3\HTMLGrammar.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLGrammarParser}.
 */
public interface HTMLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(HTMLGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(HTMLGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#listaOrdenada}.
	 * @param ctx the parse tree
	 */
	void enterListaOrdenada(HTMLGrammarParser.ListaOrdenadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#listaOrdenada}.
	 * @param ctx the parse tree
	 */
	void exitListaOrdenada(HTMLGrammarParser.ListaOrdenadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#listaNOrdenada}.
	 * @param ctx the parse tree
	 */
	void enterListaNOrdenada(HTMLGrammarParser.ListaNOrdenadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#listaNOrdenada}.
	 * @param ctx the parse tree
	 */
	void exitListaNOrdenada(HTMLGrammarParser.ListaNOrdenadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(HTMLGrammarParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(HTMLGrammarParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(HTMLGrammarParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(HTMLGrammarParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#tipoMarcador}.
	 * @param ctx the parse tree
	 */
	void enterTipoMarcador(HTMLGrammarParser.TipoMarcadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#tipoMarcador}.
	 * @param ctx the parse tree
	 */
	void exitTipoMarcador(HTMLGrammarParser.TipoMarcadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#tabela}.
	 * @param ctx the parse tree
	 */
	void enterTabela(HTMLGrammarParser.TabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#tabela}.
	 * @param ctx the parse tree
	 */
	void exitTabela(HTMLGrammarParser.TabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(HTMLGrammarParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(HTMLGrammarParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#coluna}.
	 * @param ctx the parse tree
	 */
	void enterColuna(HTMLGrammarParser.ColunaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#coluna}.
	 * @param ctx the parse tree
	 */
	void exitColuna(HTMLGrammarParser.ColunaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#coluna_cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterColuna_cabecalho(HTMLGrammarParser.Coluna_cabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#coluna_cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitColuna_cabecalho(HTMLGrammarParser.Coluna_cabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(HTMLGrammarParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(HTMLGrammarParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(HTMLGrammarParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(HTMLGrammarParser.ItemContext ctx);
}