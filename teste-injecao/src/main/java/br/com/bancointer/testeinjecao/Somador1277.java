package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1277")
public class Somador1277 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
