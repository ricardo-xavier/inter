package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1378")
public class Somador1378 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
