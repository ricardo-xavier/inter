package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador7")
public class Somador7 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
