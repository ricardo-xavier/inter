package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1215")
public class Somador1215 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
