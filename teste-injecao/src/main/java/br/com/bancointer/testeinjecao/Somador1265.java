package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1265")
public class Somador1265 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
