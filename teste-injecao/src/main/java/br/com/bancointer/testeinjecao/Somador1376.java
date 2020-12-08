package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1376")
public class Somador1376 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
