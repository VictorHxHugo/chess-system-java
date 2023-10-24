package application;
import chess.ChessMatch;
import chess.ChessPosition;

public class program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
		UI.printBoard((chessMatch.getPieces()));
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessMatch.perfomChessMove(source, target);

	}

}
